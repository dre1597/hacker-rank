if __name__ == '__main__':
  n = int(input())
  myList = []
  
  for _ in range(n):
    user_input = input().strip().split(' ')
    
    if user_input[0] == 'insert':
      myList.insert(int(user_input[1]), int(user_input[2]))
    if user_input[0] == 'print':
      print(myList)
    if user_input[0] == 'remove':
      myList.remove(int(user_input[1]))
    if user_input[0] == 'append':
      myList.append(int(user_input[1]))
    if user_input[0] == 'sort':
      myList.sort()
    if user_input[0] == 'pop':
      myList.pop()
    if user_input[0] == 'reverse':
      myList.reverse()