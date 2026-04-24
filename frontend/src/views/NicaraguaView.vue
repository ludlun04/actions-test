<script setup lang="ts">
const nicaraguaFacts = {
  capital: 'Managua',
  population: 'Approx. 7.0 million',
  language: 'Spanish',
  currency: 'Nicaraguan Córdoba (NIO)',
  timezone: 'Central Standard Time (CST, UTC-6)'
}

const highlights = [
  'Home to large freshwater lakes, including Lake Nicaragua.',
  'Known for volcanic landscapes and diverse natural reserves.',
  'Coffee and agriculture are important parts of the economy.',
  'Popular destinations include Granada, León, and Pacific beaches.'
]
</script>

<template>
  <main class="nicaragua-view">
    <h1>Nicaragua Overview</h1>
    <p>
      Nicaragua is the largest country in Central America, known for its lakes,
      volcanoes, and rich cultural heritage.
    </p>

    <section>
      <h2>Key Facts</h2>
      <ul>
        <li><strong>Capital:</strong> {{ nicaraguaFacts.capital }}</li>
        <li><strong>Population:</strong> {{ nicaraguaFacts.population }}</li>
        <li><strong>Language:</strong> {{ nicaraguaFacts.language }}</li>
        <li><strong>Currency:</strong> {{ nicaraguaFacts.currency }}</li>
        <li><strong>Timezone:</strong> {{ nicaraguaFacts.timezone }}</li>
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
.nicaragua-view {
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
