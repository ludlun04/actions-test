<script setup lang="ts">
const countryInfo = {
  name: 'Ivory Coast',
  officialName: 'Côte d\'Ivoire',
  capital: 'Yamoussoukro (administrative), Abidjan (de facto)',
  region: 'West Africa',
  population: '~27 million',
  currency: 'West African CFA franc (XOF)'
}

const highlights = [
  'World\'s largest cocoa producer',
  'Located on the Gulf of Guinea',
  'Official language: French',
  'Rich cultural heritage and music tradition',
  'Important economic hub in West Africa'
]
</script>

<template>
  <main class="ivory-coast-view">
    <h1>{{ countryInfo.officialName }}</h1>
    <p>
      Explore information about {{ countryInfo.name }}, a vibrant country in {{ countryInfo.region }}.
    </p>

    <section>
      <h2>Country Overview</h2>
      <ul>
        <li><strong>Name:</strong> {{ countryInfo.name }}</li>
        <li><strong>Official Name:</strong> {{ countryInfo.officialName }}</li>
        <li><strong>Capital:</strong> {{ countryInfo.capital }}</li>
        <li><strong>Region:</strong> {{ countryInfo.region }}</li>
        <li><strong>Population:</strong> {{ countryInfo.population }}</li>
        <li><strong>Currency:</strong> {{ countryInfo.currency }}</li>
      </ul>
    </section>

    <section>
      <h2>Key Highlights</h2>
      <ul>
        <li v-for="(highlight, idx) in highlights" :key="idx">
          {{ highlight }}
        </li>
      </ul>
    </section>
  </main>
</template>

<style scoped>
.ivory-coast-view {
  max-width: 56rem;
  margin: 2rem auto;
  padding: 0 1rem;
  line-height: 1.6;
  font-family: 'Inter', 'Segoe UI', Roboto, Arial, sans-serif;
}

h1 {
  color: #d97706;
  font-weight: 700;
  margin-bottom: 0.5rem;
}

h2 {
  color: #b45309;
  font-weight: 600;
  margin-top: 1.5rem;
  margin-bottom: 0.5rem;
}

section {
  margin-top: 1.5rem;
}

ul {
  padding-left: 1.2rem;
}

li {
  margin-bottom: 0.5rem;
}
</style>
