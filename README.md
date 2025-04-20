# Selenium Training Project

This project is a training ground for web automation using Playwright with React and TypeScript. It demonstrates how to set up and run automated tests using Playwright in a modern React application.

## Features

- React 18 with TypeScript
- Vite for fast development and building
- Playwright for end-to-end testing
- Sample counter component with tests
- Modern development setup with ESLint

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/HyperShot90/selenium.git
   cd selenium
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Install Playwright browsers:
   ```bash
   npx playwright install
   ```

4. Start the development server:
   ```bash
   npm run dev
   ```

5. Run the tests:
   ```bash
   # Run tests in headless mode
   npm run test
   
   # Run tests with UI mode
   npm run test:ui
   ```

## Project Structure

```
selenium/
├── src/
│   └── App.tsx         # Main React component
├── tests/
│   └── app.spec.ts     # Playwright tests
├── playwright.config.ts # Playwright configuration
├── tsconfig.json       # TypeScript configuration
└── package.json        # Project dependencies and scripts
```

## Available Scripts

- `npm run dev` - Start the development server
- `npm run build` - Build the project for production
- `npm run test` - Run Playwright tests
- `npm run test:ui` - Run Playwright tests with UI mode
- `npm run lint` - Run ESLint

## Contributing

Feel free to submit issues and enhancement requests! 