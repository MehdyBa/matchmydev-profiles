import BaseComponent from "../BaseComponent.js";

export default class MenuComponent extends BaseComponent{
    
    constructor(){
        super("#header");
    }

    template(){
        return `
        <header class="bg-black fixed-top">
            <nav class="navbar navbar-expand-md navbar-dark container-xl">
                <span class="font-logo">
                    <span>match</span><span class="logo-center">my</span><span>dev</span>
                </span>
                <button class="navbar-toggler me-2" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#/search-profiles">Search profiles</a>
                    </li>
                        <li class="nav-item">
                    <a class="nav-link" href="#/edit-profile">My profile</a>
                    </li>
                </ul>
                </div>
            </nav>
        </header>`;
    }
}