// Add your JavaScript code here
document.addEventListener('DOMContentLoaded', function() {
    // Add event listeners for login and signup buttons
    document.getElementById('loginBtn').addEventListener('click', function() {
        // Redirect to login page
        window.location.href = '/login';
    });

    document.getElementById('signupBtn').addEventListener('click', function() {
        // Redirect to signup page
        window.location.href = '/signup';
    });
});
