import { test, expect } from '@playwright/test';

test('homepage has correct title and counter works', async ({ page }) => {
  await page.goto('/');

  // Verify title
  await expect(page.locator('h1')).toHaveText('Selenium Training Project');

  // Test counter functionality
  const counterButton = page.getByRole('button');
  await expect(counterButton).toHaveText('Count is 0');

  // Click the counter button and verify it increments
  await counterButton.click();
  await expect(counterButton).toHaveText('Count is 1');
});