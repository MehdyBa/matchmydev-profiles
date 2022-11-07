import "./searchProfiles.css";
import {messages} from "../messages.js";

function renderSearchProfiles (){
    const searchBar = `
        <h1 class="pt-3">Search for developers profiles</h1>

        <form class="mb-3 mt-4">
            <label for="search" class="form-label">Search for developers</label>
            <div class="input-group">
                <input type="text" class="form-control" id="search" />
                <span class="input-group-text"><i class="bi bi-search"></i></span>
                <button class="btn" type="submit">Search</button>
            </div>
            <div class="form-text">
                Please enter first or last name.
            </div>
      </form>

      <h2>Developers found</h2>
      <p>No developer found, please review your criteria</p>
    `;

    const main = document.getElementById("main");
    main.innerHTML = searchBar;

}

export { renderSearchProfiles};