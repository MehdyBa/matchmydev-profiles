import "./notFound.css"

function renderNotFound() {
    const content = `
    <h1>404 Page not found</h1>
    <p>The ressource requested could not be found on this server !</p>
    <img class="error-image"
     src="../../../assets/notFound.svg"
     alt="404 not found">`

    const main = document.getElementById("main");
    main.innerHTML = content;
}

export { renderNotFound };