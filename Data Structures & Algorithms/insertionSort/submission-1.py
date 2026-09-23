class Solution:
    def insertionSort(self, pairs: List[Pair]) -> List[List[Pair]]:
        arr = list(pairs)
        result = []
        
        for i in range(len(arr)):
            key_pair = arr[i]
            j = i - 1
            while j >= 0 and arr[j].key > key_pair.key:
                arr[j + 1] = arr[j]
                j -= 1
            arr[j + 1] = key_pair
            result.append(list(arr))
        
        return result