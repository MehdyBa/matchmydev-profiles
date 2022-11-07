import { renderNotfound } from "./components/errors/notFound/notFound.js";
import { renderForbidden } from "./components/errors/forbidden/forbidden.js"
import { renderUnauthorized } from "./components/errors/unauthorized/unauthorized.js"
import { renderInternalServerError } from "./components/errors/internalServerError/internalServerError.js"
import { renderSearchProfiles } from "./components/searchProfiles/searchProfiles.js"

window.addEventListener("hashchange", (event) => route(event));

function route(event) {
    const hash = window.location.hash;
    if (hash == "/#/search-profiles" || hash == "") {
        renderSearchProfiles();
    } else if  (hash == "/#/not-found") {
        renderNotfound();
    } else if (hash == "/#/forbiden") {
        renderForbidden();
    } else if (hash == "/#/unauthorized") {
        renderUnauthorized();
    } else if (hash == "/#/internal-server-error") {
        renderInternalServerError();
    }

}

export { route };