import MenuComponent from "./components/MenuComponent/MenuComponent.js";
import SearchProfilesComponent from "./components/searchProfiles/SearchProfilesComponent.js";
import NotFoundComponent from "./components/errors/notFound/NotFoundComponent.js";
import ForbidenComponent from "./components/errors/forbidden/ForbidenComponent.js";
import UnauthorizedComponent from "./components/errors/unauthorized/UnauthorizedComponent.js";
import InternalServerErrorComponent from "./components/errors/internalServerError/InternalServerErrorComponent.js";
import EditProfileComponent from "./components/editProfileComponent/EditProfileComponent.js";

export default class Router {
    static init() {
        window.addEventListener("hashchange", (event) => Router.route(event));
        const menuComponent = new MenuComponent();
        menuComponent.render();
        Router.route();
    }

    static route(event) {
        const hash = window.location.hash;
        let component = null;
    if (hash == "#/search-profiles" || hash == "") {
        component = new SearchProfilesComponent();
    } else if  (hash == "#/not-found") {
        component = new NotFoundComponent();
    } else if (hash == "#/forbiden") {
        component = new ForbidenComponent();
    } else if (hash == "#/unauthorized") {
        component = new UnauthorizedComponent();
    } else if (hash == "#/internal-server-error") {
        component = new InternalServerErrorComponent();
    } else if(hash =="#/edit-profile" ) {
        component = new EditProfileComponent();
    }
    component.render();

    }

}


