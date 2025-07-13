#Task02
import numpy as np
import fhm_unittest as unittest

class Node:
  def __init__(self,elem,next = None):
    self.elem,self.next = elem,next

def createList(arr):
  head = Node(arr[0])
  tail = head
  for i in range(1,len(arr)):
    newNode = Node(arr[i])
    tail.next = newNode
    tail = newNode
  return head

def printLinkedList(head):
  temp = head
  while temp != None:
    if temp.next != None:
      print(temp.elem, end = '-->')
    else:
      print(temp.elem)
    temp = temp.next
  print()



def sum_dist(head, arr):
  current = head
  index = 0
  sum = 0
  while current:
    count = 0
    for i in range(len(arr)):
      if index == arr[i]:
        count+=1
      
    if index in arr:
      sum+=(current.elem*count)

    current = current.next
    index+=1

  return sum


#[DO NOT MODIFY THE TESTER CODES BELOW]
#[THERE WILL BE 50% PENALTY IF IT'S MODIFIED]
print('==============Test Case 1=============')
LL1 = createList(np.array([10,16,-5,9,3,4]))
dist = np.array([2,0,5,2,8])
returned_value = sum_dist(LL1, dist)
print(f'Sum of Nodes: {returned_value}') #This should print Sum of Nodes: 4
unittest.output_test(returned_value, 4)
print()