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
