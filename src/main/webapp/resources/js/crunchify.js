/**
 * 
 */


document.addEventListener('DOMContentLoaded', function() {
  // When the event DOMContentLoaded occurs, it is safe to access the DOM

  // When the user scrolls the page, execute myFunction 
  window.addEventListener('scroll', myFunction);
// When the user scrolls the page, execute myFunction


// Get the navbar
var navbar = document.getElementById("navbar");

// Get the offset position of the navbar
var sticky = navbar.offsetTop;

// Add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
  if (window.pageYOffset >= sticky) {
	console.log("window.pageYOffset >= sticky");
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
console.log("Not window.pageYOffset >= sticky");
  }
}
})

