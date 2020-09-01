
import threading

class FooBar(object):
    def __init__(self, n):
        self.n = n
        
        self.e1 = threading.Event()
        self.e2 = threading.Event()
        self.e1.set()


    def foo(self, printFoo):
        """
        :type printFoo: method
        :rtype: void
        """
        for i in range(self.n):
            
            # printFoo() outputs "foo". Do not change or remove this line.
            self.e1.wait()
            printFoo()
            self.e1.clear()
            self.e2.set()


    def bar(self, printBar):
        """
        :type printBar: method
        :rtype: void
        """
        for i in range(self.n):
            
            # printBar() outputs "bar". Do not change or remove this line.
            self.e2.wait()
            printBar()
            self.e2.clear()
            self.e1.set()


def printFoo():
    print("foo")
    
def printBar():
    print("bar")
    
    
if __name__ == '__main__':
    f = FooBar(5)
    f.foo(printFoo)
    f.bar(printBar)
