// JavaScript for mobile navigation toggle
const navLinks = document.querySelector('.nav-links');
const burgerMenu = document.querySelector('.burger-menu');

burgerMenu.addEventListener('click', () => {
    navLinks.classList.toggle('active');
});
// Show/Hide functionality for additional sections
const detailsButton = document.querySelector('.show-details');
const detailsSection = document.querySelector('.details-section');

detailsButton.addEventListener('click', () => {
    if (detailsSection.style.display === 'none') {
        detailsSection.style.display = 'block';
        detailsButton.textContent = 'Hide Details';
    } else {
        detailsSection.style.display = 'none';
        detailsButton.textContent = 'Show Details';
    }
});
