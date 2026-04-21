<script setup lang="ts">
const norwayFacts = {
  capital: 'Oslo',
  population: 'Approx. 5.5 million',
  language: 'Norwegian (Bokmål and Nynorsk)',
  currency: 'Norwegian Krone (NOK)',
  timezone: 'Central European Time (CET/CEST)'
}

const highlights = [
  'Known for dramatic fjords and mountain landscapes.',
  'One of the world\'s largest sovereign wealth funds.',
  'Northern Norway offers seasonal northern lights viewing.',
  'Strong focus on renewable energy, especially hydropower.'
]
</script>

<template>
  <main class="norway-view">
    <h1>Norway Overview</h1>
    <p>
      Norway is a Nordic country in Northern Europe, known for its coastline, fjords,
      and high quality of life.
    </p>

    <section>
      <h2>Key Facts</h2>
      <ul>
        <li><strong>Capital:</strong> {{ norwayFacts.capital }}</li>
        <li><strong>Population:</strong> {{ norwayFacts.population }}</li>
        <li><strong>Language:</strong> {{ norwayFacts.language }}</li>
        <li><strong>Currency:</strong> {{ norwayFacts.currency }}</li>
        <li><strong>Timezone:</strong> {{ norwayFacts.timezone }}</li>
      </ul>
    </section>

    <section>
      <h2>Highlights</h2>
      <ul>
        <li v-for="fact in highlights" :key="fact">{{ fact }}</li>
      </ul>
    </section>
  </main>
</template>

<style scoped>
.norway-view {
  max-width: 56rem;
  margin: 2rem auto;
  padding: 0 1rem;
  line-height: 1.6;
}

h1,
h2 {
  margin-bottom: 0.5rem;
}

section {
  margin-top: 1.5rem;
}

ul {
  padding-left: 1.2rem;
}
</style>
