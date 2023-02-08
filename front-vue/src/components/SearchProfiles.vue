<script>
import dayjs from 'dayjs';

export default {

  data() {
    return {
      dayjs,
      profiles : []
    }
  },

  methods: {
    formatDate(date) {
            return dayjs(date).format('MMM/DD/YYYY');
        }

  },

  mounted() {
   this.$axios
      .get('/profiles')
      .then((response) => { this.profiles = response.data
      })
      
  }
}
</script>

<template>
  
  <main id="main" class="container-xl my-5 pt-5">
    

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

<div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-4 mb-3 font-regular" >
  <div class="col"  v-for="profile in profiles">
        <div class="card h-100">
          <div class="card-body">
            <p class="dev-name">{{ profile.firstName }} {{ profile.lastName }}</p>
            <p class="card-text">{{ profile.contractTypeName }}</p>
            <p class="card-text"><span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span>{{ formatDate(profile.hiringDate) }}</p>
            </div>
          <div class="card-footer"><i class="bi bi-eye"></i></div>
        </div>
      </div>
</div>

  </main>

</template>
