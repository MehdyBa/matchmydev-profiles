import { createRouter, createWebHistory } from 'vue-router'
import SearchProfilesView from '../views/SearchProfilesView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/profiles',
      name: 'search-profiles',
      component: SearchProfilesView
    }
  ]
})

export default router
