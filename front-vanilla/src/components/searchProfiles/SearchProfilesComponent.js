import BaseIterableComponent from "../BaseIterableComponent.js";
import I18N from "../../I18N.js";

export default class SearchProfilesComponent extends BaseIterableComponent {

    constructor() {
        super("#main", {
            url: "http://localhost:8080/profiles",
            method: "GET",
            elementsSelector: "#profiles"
        });
    }
     

    template(){
        return `
        <h1 class="pt-3">Search for developers profiles</h1>

        <form class="mb-3 mt-4">
            <label for="search" class="form-label">Search for developers</label>
            <div class="input-group">
                <input name="search-dev" id="search" type="text" class="form-control search-bar" />
                <span class="input-group-text"><i class="bi bi-search"></i></span>
                <button class="btn" type="submit">Search</button>
            </div>
            <div class="form-text">
                Please enter first or last name.
            </div>
      </form>

      <h2>Developers found</h2>

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-4 mb-3 font-regular" id="profiles">
      </div>
      `;
    }

    elementTemplate(element) {
        return `  <div class="col">
        <div class="card h-100">
          <div class="card-body">
            <p class="dev-name">${element.firstName}</p>
            <p class="card-text">${element.lastName}</p>
            <p class="card-text"><span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span>${element.hiringDate}</p>
            </div>
          <div class="card-footer"><i class="bi bi-eye"></i></div>
        </div>
      </div> `
    }

}

