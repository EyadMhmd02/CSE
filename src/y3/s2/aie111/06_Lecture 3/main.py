from collections import deque

graph = {
    '5': ['3', '7'],
    '3': ['2', '4'],
    '7': ['8'],
    '2': [],
    '4': ['8'],
    '8': []
}

visited = [] # List for visited nodes
queue = [] # initialize a queue

def bfs(visted, graph, node): # Function for BFS
    visted.append(node) # Mark current node as visited
    queue.append(node) # Add current node to the queue
    while queue: # Iterate until the queue is empty
        m = queue.pop(0) # Retrieve and remove the first element from the queue
        print(m, end=" ") # Print the value of the current node
        for neighbor in graph[m]: # Iterate over the neighbors of the current node
            if neighbor not in visited: # Check if the neighbor has not been visted
                visited.append(neighbor) # Mark the neighbor as visited
                queue.append(neighbor) # Add the neighbor to the queue

# Driver Code
print("Following is the Breadth-First Search")
bfs(visited, graph, '5') # Function call with the initial visited list, graph and starting node