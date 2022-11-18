import BaseComponent from "../BaseComponent.js";

export default class SearchProfilesComponent extends BaseComponent {

    constructor(){
        super("#main");
    }

    template(){
        return `
        <h1 class="pt-3">Search for developers profiles</h1>

        <form class="mb-3 mt-4">
            <label for="search" class="form-label">Search for developers</label>
            <div class="input-group">
                <input name="search-dev" id="search" type="text" class="form-control" />
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
    }

}