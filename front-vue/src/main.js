import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import axios from 'axios'



// Création et configuration d'une instance axios
const axiosInstance = axios.create({
    baseURL: 'http://localhost:8080'
  });


const app = createApp(App)

// Utilasation des global properties pour accéder à axios avec sa configuration dans toute l'app
// Via $axios
app.config.globalProperties.$axios = axiosInstance;

app.use(router)

app.mount('#app')





