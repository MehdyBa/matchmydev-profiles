import axios from 'axios';

export default {
    install: (app) => {


        // Création et configuration d'une instance axios
    const axiosInstance = axios.create({
        baseURL: import.meta.env.VITE_API_BASE_URL
    });

    // Utilasation des global properties pour accéder à axios avec sa configuration dans toute l'app
   // Via $axios
   app.config.globalProperties.$axios = axiosInstance;

    

    }
  }