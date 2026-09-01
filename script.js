// Interactive message
function showMessage() {
    alert("Welcome to my Portfolio Website!");
}

// Contact form validation
function validateForm() {

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let message = document.getElementById("message").value;
    let result = document.getElementById("result");

    if (name == "" || email == "" || message == "") {
        result.innerText = "Please fill all the fields.";
        result.style.color = "red";
        return false;
    }

    result.innerText = "Thank you! Your message has been submitted.";
    result.style.color = "green";

    return false;
}
