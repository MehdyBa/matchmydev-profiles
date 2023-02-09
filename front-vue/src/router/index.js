import { createRouter, createWebHistory } from "vue-router";
import SearchProfilesView from "../views/SearchProfilesView.vue";
import EditProfile from "../components/EditProfile.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/profiles",
      name: "search-profiles",
      component: SearchProfilesView,
    },
    {
      path: "/profiles/1",
      name: "edit-profile",
      component: EditProfile,
    },
  ],
});

export default router;
