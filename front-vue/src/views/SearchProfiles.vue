<script>

export default {

  data() {
    return {
      profiles : []

    }
  },

  mounted() {
   this.$axios
      .get('/profiles')
      .then((response) => { this.profiles = response.data
        console.log(response)
      })
  }
}
</script>

<template>
  
  <main id="main" class="container-xl my-5 pt-5">

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
        </header>

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
            <p class="card-text">{{ profile.contractType }}</p>
            <p class="card-text"><span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span>{{ profile.hiringDate }}</p>
            </div>
          <div class="card-footer"><i class="bi bi-eye"></i></div>
        </div>
      </div>
</div>

  </main>





</template>

<style>
body {
    color:#000000;
    font-family: 'Source Sans Pro', sans-serif;
}

/* Header css */

.font-logo {
    font-family: 'Source Code Pro', monospace;
    font-weight: 600;
    font-size: 2rem;
    color: white;

}
.logo-center {
    color: #f00;
}
.navbar {
    padding-left: 0.75rem;
    padding-right:0.75rem;
}

/* search profiles css */

.btn {
    background-color: #A9A9A9;
    border-color: #A9A9A9 ;
    letter-spacing: 0.1rem;
    font-weight:600;
}

.btn:hover{
    background-color: #DCDCDC;
    border-color:#A9A9A9;
    box-shadow : 0px 0px 5px 4px #DCDCDC;
}

.form-control{
    border-right: none;
}

.form-control:focus{
    border: none;
    box-shadow: 0px 0px 5px 4px #DCDCDC;

}

.form-text {
    color: #A9A9A9;
}

.form-label {
    font-weight: 600;
    
}

.input-group-text{
    background-color: white;
    border-left: none;
    color:#A9A9A9;
}

.card {
    height: 100%;
    cursor: pointer;
}

.card:hover {
    box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
}

.dev-name {
    font-weight: bold;
}

.dev-name:hover {
    text-decoration: underline;
}

.card-footer {
    background-color: #DCDCDC;
    text-align: end;

}

</style>

