const apiUrl = "http://localhost:8080/api/users";

// Fetch all users
function fetchUsers() {
  fetch(apiUrl)
    .then(res => res.json())
    .then(data => {
      const list = document.getElementById("userList");
      list.innerHTML = "";
      data.forEach(user => {
        const li = document.createElement("li");
        li.innerHTML = `
          ${user.username} (${user.email}) - ${user.role}
          <button onclick="deleteUser(${user.id})">Delete</button>
        `;
        list.appendChild(li);
      });
    });
}

// Add a user
document.getElementById("userForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const user = {
    username: document.getElementById("username").value,
    email: document.getElementById("email").value,
    password: document.getElementById("password").value,
    role: document.getElementById("role").value
  };

  fetch(apiUrl, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user)
  })
    .then(res => res.json())
    .then(() => {
      fetchUsers(); // refresh list
      this.reset(); // clear form
    });
});

// Delete user
function deleteUser(id) {
  fetch(`${apiUrl}/${id}`, {
    method: "DELETE"
  }).then(() => fetchUsers());
}

// Initial load
fetchUsers();
