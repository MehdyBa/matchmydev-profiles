<script>
import dayjs from 'dayjs';

export default {

  data() {
    return {
      dayjs,
      profile : {}
    }
  },

  methods: {
    formatDate(date) {
            return dayjs(date).format('MMM DD, YYYY');
        }

  },

  mounted() {
   this.$axios
      .get('/profiles/1')
      .then((response) => { this.profiles.id = response.data
      })
      
  }
}
</script>
<template>
<h1>My Profile</h1>
<!-- <div class="row row-cols-1 row-cols-md-2 mb-3 mt-4">
        <div class="col-md-4 mb-5">
          <img src="${profile.avatar}"
            class="rounded img-fluid">
        </div>
        <div class="col-md-4">
          <h2 class="profile-dev-name">${profile.firstName} ${profile.lastName}</h2>
          <p>${profile.email}</p>
          <p>${profile.identifier}</p>
          <p>${profile.jobTitle}</p>
          <p> <span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span> ${profile.hiringDate}</p>
          <p>${profile.contractType}</p>
        </div>
      </div> -->

        <div id="non-editable-profile"></div>
        <div class="mb-3 mt-4">
          <form>
            <input class="form-control " type="file" id="formFile">
            <div class="form-text mb-3">Photo, avatar or any image.</div>
    
            <label for="description" class="form-label">Description</label>
            <textarea name="description" id="description" class="form-control" rows="10"></textarea>
            <div class="form-text">Text with a maximum of 1000 chars.</div>
    
            <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-4">
              <button class="btn btn-primary me-md-2" type="submit">Update</button>
            </div>
          </form>
        </div>
</template>