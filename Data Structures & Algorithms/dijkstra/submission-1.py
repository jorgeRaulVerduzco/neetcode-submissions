import heapq
from typing import List, Dict

class Solution:
    def shortestPath(self, n: int, edges: List[List[int]], src: int) -> Dict[int, int]:
        # Construir lista de adyacensia
        graph = {i: [] for i in range(n)}
        for u, v, w in edges:
            graph[u].append((v, w))

        # Inicializr distancias
        dist = {i: float('inf') for i in range(n)}
        dist[src] = 0

        heap = [(0, src)]
        visited = set()

        while heap:
            d, u = heapq.heappop(heap)

            if u in visited:
                continue
            visited.add(u)

            for v, w in graph[u]:
                if v not in visited and d + w < dist[v]:
                    dist[v] = d + w
                    heapq.heappush(heap, (dist[v], v))

        # Reemplazar infinitos por -1
        return {i: (dist[i] if dist[i] != float('inf') else -1) for i in range(n)}