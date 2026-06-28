class Node:
    def __init__(self,val,nxt,prv):
        self.val = val
        self.nxt = nxt
        self.prv = prv

class MyCircularQueue:

    def __init__(self, k: int):
        self.space = k
        self.left = Node(0,None,None)
        self.right = Node(0,None,self.left)
        self.left.nxt = self.right

    def enQueue(self, value: int) -> bool:
        if self.isFull(): return False
        node = Node(value,self.right,self.right.prv)
        self.right.prv.nxt = node
        self.right.prv = node
        self.space -= 1
        return True

    def deQueue(self) -> bool:
        if self.isEmpty(): return False
        self.left.nxt.nxt.prv = self.left
        self.left.nxt = self.left.nxt.nxt
        self.space += 1
        return True

    def Front(self) -> int:
        if self.isEmpty(): return -1
        return self.left.nxt.val

    def Rear(self) -> int:
        if self.isEmpty(): return -1
        return self.right.prv.val

    def isEmpty(self) -> bool:
        return self.left.nxt == self.right

    def isFull(self) -> bool:
        return self.space == 0


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()