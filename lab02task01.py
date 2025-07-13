#Assignment_Task_01

class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    def addMultiple(self,*args):
        self.head = Node(args[0])
        current = self.head
        for i in range(1,len(args)):
            new_node = Node(args[i])
            current.next = new_node
            current = current.next
    def printLL(self):
        current = self.head
        while current:
            print(current.data, end = " ---> ")
            current = current.next
        print(None)

    def isSame(self,LL):
        current1 = self.head
        current2 = LL.head
        count = 0
        index = 0
        while current1 and current2:
            if current1.data == current2.data:
                count+=1
            current1 = current1.next
            current2 = current2.next
            index+=1
        if count == index and current1==None and current2==None:
            print("Similar")
        else:
            print("Not Similar")


LL1 = LinkedList()
LL1.addMultiple("Red","Green","Yellow","Red","Blue","Green")
LL2 = LinkedList()
LL2.addMultiple("Red","Green","Yellow","Red","Blue","Green","Red")
LL1.printLL()
LL2.printLL()
LL1.isSame(LL2)
