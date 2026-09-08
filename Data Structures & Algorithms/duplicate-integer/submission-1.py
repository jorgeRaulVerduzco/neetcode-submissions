class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        numeros = set()

        for numero in nums:
            if numero in numeros:
                return True
            numeros.add(numero)

        return False
        