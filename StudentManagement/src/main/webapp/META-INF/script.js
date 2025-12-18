document.getElementById("studentForm").addEventListener("submit", function (e) {
    e.preventDefault();
    const data = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        course: document.getElementById("course").value
    };

    fetch("AddStudentServlet", {
        method: "POST",
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    }).then(response => {
        if (response.ok) {
            alert("Student added successfully");
            location.reload();
        }
    });
});
