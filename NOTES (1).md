# Complexity Notes

| Task | Time | Space | Why |
|------|------|-------|-----|
| isEven | O(1) | O(1) | No loop. One calculation. |
| largest | O(n) | O(1) | One loop. Only max is stored. |
| countPositives | O(n) | O(1) | One loop. Only count is stored. |
| reverseArray | O(n) | O(n) | One loop. The new array grows with the input. |
| removeDuplicates (ArrayList) | O(n²) | O(n) | list.contains loops inside the loop. |
| removeDuplicatesHash (LinkedHashSet) | O(n) | O(n) | Set lookup is about 1 step. Two loops side by side. |
| containsDuplicate (ArrayList) | O(n²) | O(n) | arr.contains loops inside the loop. |
| containsDuplicate2 (HashSet) |O(n) | O(n) | Set lookup is about 1 step.Two loops side by side. |
| isValidAnagram (sorting version) | O(n log n) | O(n) | strings to arrays -> sorting -> comparing |
| ArrayValidAnagram (counting version) | O(n) | O(1) | array is always 26 boxes |
| isPalindrome (cleaning version) | O(n) | O(n) | clean the input , before checking |
| isPalindromeSecond (skipping pointers) | O(n) | O(1) | two pointers, but let them skip junk characters as they move |
| Best Time to Buy and Sell Stock | O(n) | O(1) | One loop.Only int variables created |
| Move Zeroes | O(n) | O(1) | insertPos = where the next non-zero goes, then swap |
| Missing Number | O(n) | O(n) | the set is “what I have”, the loop 0..n is “what should be there” |
| Valid Parentheses| O(n) | O(n) | opening = push, closing = check the top and pop |
| Unique | O(n) | O(n) | 2 loops but not nested , HashMap stores up to $n$ unique characters |
|Binary Search | O(log n) | O(1) | O(log n) because it have a loop but he divide the steps, time grow slower , when input grow, if we have 1000 numbers its about 10 steps if we have 1 000 000 its about 20 steps |
|Single Number (HashMap) | O(n) | O(n) | We create a HashMap where each key is a number and its value is the number of times it appears, then return the key whose value is 1 |
| IntersectionOfTwoArrays | O(n + m) | O(n + m) | T: O(n + m) — We traverse both input arrays 
S: O(n + m) — We use HashSets and an array that can grow with the input sizes. |


# Mistakes 
| Task | Bug | Fix |
|---------|--------|--------|
|Best Time to Buy and Sell Stock | maxProfit was replaced by the last profit each time. The last profit is not always the biggest |  Math.max(maxProfit, newProfit). Then the best value never goes down |