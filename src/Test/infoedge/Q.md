Coding Round – Must-Prepare Questions
1. LRU Cache
   Implement an LRU Cache with get/put in O(1).
   👉 Concepts: LinkedHashMap / Custom DLL + HashMap
   ✅ Asked to test your design+code structuring skills.

2. Find K Most Frequent Elements

   Input: [1,1,1,2,2,3], k=2 → Output: [1,2]
   👉 Concepts: HashMap + Min Heap
   ✅ Real-life use case: Top searches, trending keywords, etc.

3. Sliding Window Max

   Input: nums = [1,3,-1,-3,5,3,6,7], k = 3  
   Output: [3,3,5,5,6,7]
   👉 Concepts: Deque
   ✅ Tests window management + performance

4. Subarray Sum Equals K
   Input: nums = [1,2,3], k = 3 → Output: 2
   👉 Concepts: Prefix sum + HashMap
   ✅ Common in systems that track running totals (billing, analytics)

5. Longest Substring Without Repeating Characters

   Input: "abcabcbb" → Output: 3
   👉 Concepts: Sliding Window + Set
   ✅ Shows you know how to optimize time with pointers

6. Group Anagrams

   Input: ["eat","tea","tan","ate","nat","bat"]  
   Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
   👉 Concepts: HashMap with custom keys (sorted strings)
   ✅ You might have to scale for millions of inputs.

7. Merge Intervals

   Input: [[1,3],[2,6],[8,10],[15,18]]  
   Output: [[1,6],[8,10],[15,18]]
   👉 Concepts: Sorting + Merge
   ✅ Real-world: Scheduling, bookings, time slots, etc.

8. Validate Parentheses

   Input: "()[]{}" → Output: true
   👉 Concepts: Stack
   ✅ Quick one. Often asked as warm-up.

9. Minimum Window Substring
   Input: s = "ADOBECODEBANC", t = "ABC"  
   Output: "BANC"
   👉 Concepts: Sliding Window + Char Frequency
   ✅ Bit complex. They love it for testing optimal thinking.

10. Design a Rate Limiter (Advanced)
    → You get a userId and timestamp, allow max X requests per minute.
    👉 Concepts: Queue + Timestamp Handling + Clean Design
    ✅ Comes up in LLD/System design in code format

Bonus: If They Ask System Logic-Based
🔧 Design a simple in-memory key-value store
🔧 Design a scheduler for delayed tasks
🔧 Build a REST-style endpoint in pseudo Java code (take JSON input, return response)

⚙️ How to Solve?
Dry run with sample input

Focus on time complexity

Explain “Why this data structure?”

Mention edge cases

Write modular + clean code (even in whiteboard)

