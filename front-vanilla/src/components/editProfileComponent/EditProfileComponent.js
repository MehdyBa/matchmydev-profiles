import BaseFormComponent from "../BaseFormComponent.js";

export default class EditProfileComponent extends BaseFormComponent {
    constructor() {
        super("#main",
        { nonEditableSelector: "#non-editable-profile"
        }) 
     }
     dataModel() {
        return{
           firstName: "Medhy",
           lastName: "Badaoui",
           email: "medhy@gmail.com",
           avatar: "https://www.berkshireaerial.com/wp-content/uploads/2019/01/facebook-anon-female-icon.jpg",
           description: "Here is my desc...",
           identifier: null,
           hiringDate: null, 
           contractType: null,
           jobTitle: "Developer"

        }
     }
     nonEditableTemplate(data){
        
        return ` <div class="row row-cols-1 row-cols-md-2 mb-3 mt-4">
        <div class="col-md-4 mb-5">
          <img src="${data.avatar}"
            class="rounded img-fluid">
        </div>
        <div class="col-md-4">
          <h2 class="profile-dev-name">${data.firstName} ${data.lastName}</h2>
          <p>${data.email}</p>
          <p>${data.identifier}</p>
          <p>${data.jobTitle}</p>
          <p> <span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span> ${data.hiringDate}</p>
          <p>${data.contractType}</p>
        </div>
      </div>`;
     }

     template() {
        return `<h1>My profile</h1>
        <div id="non-editable-profile"></div>
        <div class="mb-3 mt-4">
          <form>
    
            <input class="form-control " type="file" id="formFile">
            <div class="form-text mb-3">Photo, avatar or any image.</div>
    
            <label for="description" class="form-label">Description</label>
            <textarea name="description" id="description" class="form-control" rows="10"></textarea>
            <div class="form-text">Text with maximum of 1000 chars.</div>
    
            <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-4">
              <button class="btn btn-primary me-md-2" type="submit">Update</button>
            </div>
          </form>
        </div>`;
     }

    
}