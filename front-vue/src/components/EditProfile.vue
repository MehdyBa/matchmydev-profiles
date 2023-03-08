<script>
import { looseEqual } from '@vue/shared';
import dayjs from 'dayjs';
import { useVuelidate } from '@vuelidate/core'
import { maxLength } from '@vuelidate/validators'

const validSize = (value) => value === true

export default {
  setup() {
      return { v$: useVuelidate()}
  },

  data() {
    return {
      sizeFile: true,
      dayjs,
      profile : {
        firstName:null,
        lastName:null
      },
      inputs:{
        description:null,
        file:null
      }
    }
  },

  validations(){
    return{
      inputs:{
        file://valider taille du fichier si renseigné
        description://valider longueur description 
      }
    }
  },

  methods: {
    formatDate(date) {
      return dayjs(date).format('MMM DD, YYYY');
    },

    async updateProfile(){
      const valid = await this.v$.$validate();
      if(valid){
        const formData = new FormData()
        formData.append('avatar', this.file)
        formData.append('description', this.profile.description.trim())
        const response = await this.$axios.patch('/profiles/1', formData);
      }
    },

    handleFileUpload(event){
      if(event.target.files[0].size < 10000){
        this.file = event.target.files[0]
        this.sizeFile = true
        console.log("Good size : "+ this.file.size)
      }else{
       this.sizeFile = false
       console.log("Too heavy : "+ event.target.files[0].size)
      }
    }
  },

  async mounted() {
    const response = await this.$axios.get('/profiles/1') 
    const data = response.data
    this.profile.firstName = data.firstName
    this.inputs.description = data.description
  }
}
</script>
<template>
  <main id="main" class="container-xl my-5 pt-5"> 
  <h1>My Profile</h1>
  <div class="row row-cols-1 row-cols-md-2 mb-3 mt-4">
          <div class="col-md-4 mb-5">
            <img :src="profile.avatar" class="rounded img-fluid">
          </div>
          <div class="col-md-4">
            <h2 class="profile-dev-name">{{profile.firstName}} {{profile.lastName}}</h2>
            <p>{{profile.email}}</p>
            <p>{{profile.identifier}}</p>
            <p>{{profile.jobTitle}}</p>
            <p> <span class="me-2 mb-2"><i class="bi bi-briefcase"></i></span> {{profile.hiringDate}}</p>
            <p>{{profile.contractType}}</p>
          </div>
        </div>
        
          <div class="mb-3 mt-4">
            <form @submit.prevent="updateProfile" >
              <input class="form-control " type="file" id="formFile" accept="image/png,image/gif,image/jpeg"  @change="handleFileUpload"
                :class="{'is-invalid': v$.sizeFile.$error}">
              <div class="form-text text-danger" v-if="v$.sizeFile.$error">Image size must be less than 500ko</div>
              <div class="form-text mb-3" v-else>Photo, avatar or any image.</div>
      
              <label for="description" class="form-label">Description</label>
              <textarea v-model.trim="profile.description" name="description" id="description" class="form-control" rows="10">{{ profile.description }}</textarea>
              <div class="form-text">Text with a maximum of 1000 chars.</div>
      
              <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-4">
                <button class="btn btn-primary me-md-2" type="submit">Update</button>
              </div>
            </form>
          </div>
        </main>
</template>
