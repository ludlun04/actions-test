<script setup lang="ts">
const buildInfo = {
  appName: 'Release Notes Portal',
  version: '0.0.1-test',
  environment: 'staging-simulated',
  lastDeployment: '2026-04-08 14:30 UTC'
}

const teamContacts = [
  { name: 'Alex Testerson', role: 'QA Lead', email: 'alex.testerson@example.com' },
  { name: 'Jordan Sample', role: 'Product Owner', email: 'jordan.sample@example.com' },
  { name: 'Sam Placeholder', role: 'Support Engineer', email: 'sam.placeholder@example.com' }
]
</script>

<template>
  <main class="about-view">
    <h1>About This Test Page</h1>
    <p>
      This is fake placeholder content used to verify routing, layouts, and CI/CD deployments.
    </p>

    <section>
      <h2>Build Information</h2>
      <ul>
        <li><strong>Application:</strong> {{ buildInfo.appName }}</li>
        <li><strong>Version:</strong> {{ buildInfo.version }}</li>
        <li><strong>Environment:</strong> {{ buildInfo.environment }}</li>
        <li><strong>Last Deployment:</strong> {{ buildInfo.lastDeployment }}</li>
      </ul>
    </section>

    <section>
      <h2>Test Contacts</h2>
      <ul>
        <li v-for="member in teamContacts" :key="member.email">
          {{ member.name }} — {{ member.role }} ({{ member.email }})
        </li>
      </ul>
    </section>
  </main>
</template>

<style scoped>
.about-view {
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
