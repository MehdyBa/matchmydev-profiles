import { createRouter, createWebHistory } from 'vue-router'
import SearchProfiles from '../views/SearchProfiles.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'search profiles',
      component: SearchProfiles
    }
  ]
})

export default router
