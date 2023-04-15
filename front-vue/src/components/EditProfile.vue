<script>
import dayjs from 'dayjs';
import { useVuelidate } from '@vuelidate/core'
import { maxLength, maxValue, minLength,minValue } from '@vuelidate/validators'

export default {
  setup() {
      return { v$: useVuelidate()}
  },

  data() {
    return {
      fileSystem: "http://localhost:5500/images/",
      sizeFile: true,
      dayjs,
      profile : {
        firstName: null,
        lastName: null,
        email: null,
        identifier: null, 
        jobTitle: null,
        hiringDate: null, 
        contractType: null,
        avatar: null
      },

      inputs:{
        description: null,
        file: null
      }
    }
  },

  validations(){
    return{
      inputs:{
        file: {
          maxValue:
           (file) => {
            return file.size < 512000 ? true : false 
          }
        } ,
        description: { 
          maxLength: maxLength(1000) 
        }

      }
    }
  },

  methods: {
    formatDate(date) {
      return dayjs(date).format('MMM DD, YYYY');
    },

    async getProfile(){
      const response = await this.$axios.get('/profiles/my') 
      const data = response.data
      this.profile.firstName = data.firstName
      this.profile.lastName = data.lastName
      this.profile.email = data.email
      this.profile.identifier = data.identifier
      this.profile.jobTitle = data.jobTitle
      this.profile.hiringDate = data.hiringDate
      this.profile.contractType = data.contractype
      this.profile.avatar = data.avatar

      this.inputs.description = data.description
    },

    async updateProfile(){
        const valid = await this.v$.$validate();

        if (valid) {
          const formData = new FormData()
          formData.append('avatar', this.inputs.file)
          formData.append('description', this.inputs.description)
          await this.$axios.patch('/profiles/my', formData);
        }     
    },

    async handleFileUpload(event){
        this.inputs.file = event.target.files[0]
    }
  },

  async mounted() {
    this.getProfile();
  }
}
</script>
<template>
  <main id="main" class="container-xl my-5 pt-5"> 
  <h1>My Profile</h1>
  <div class="row row-cols-1 row-cols-md-2 mb-3 mt-4">
          <div class="col-md-4 mb-5">
            <img :src="fileSystem + profile.avatar" class="rounded img-fluid">
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
            <form novalidate @submit.prevent="updateProfile" >
              <input  :class="{'is-invalid': v$.inputs.file.$error}" class="form-control " type="file" id="formFile" accept="image/png,image/gif,image/jpeg"  @change="handleFileUpload">
              <div class="form-text text-danger" v-if="v$.inputs.file.$error">Image size must be less than 500ko</div>
              <div class="form-text mb-3" v-else>Photo, avatar or any image.</div>
              
              
              <label for="description" class="form-label">Description</label>
              <textarea :class="{ 'is-invalid': v$.inputs.description.$error }" v-model.trim="inputs.description" name="description" id="description" class="form-control" rows="10">{{ inputs.description }}</textarea>
              <div class="form-text"  :class="{ 'text-danger': v$.inputs.description.$error }">Text with a maximum of 1000 chars.</div>
      
              <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-4">
                <button class="btn btn-primary me-md-2" type="submit">Update</button>
              </div>
            </form>
          </div>
        </main>
</template>
