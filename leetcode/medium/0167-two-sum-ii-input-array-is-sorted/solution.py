class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        res = []
        left = 0
        right = len(numbers) - 1

        while left < right:
            total = numbers[left] + numbers[right]

            if total == target:
                res.append(left + 1)
                res.append(right + 1)
                return res

            elif total > target:
                right -= 1

            else:
                left += 1