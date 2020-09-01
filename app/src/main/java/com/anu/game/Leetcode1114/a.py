import threading


class Foo:
    def __init__(self):
        # Initialize events for threads
        self.event1 = threading.Event()
        self.event2 = threading.Event()
    

    def first(self, printFirst):
        printFirst()
        # set flag
        self.event1.set()


    def second(self, printSecond):
        # wait for flag
        self.event1.wait()
        printSecond()
        # set flag
        self.event2.set()


    def third(self, printThird):
        # wait for flag
        self.event2.wait()
        printThird()
        
        
        
        
        
def printFirst():
        print("first")
        
def printSecond():
        print("second")
    
def printThird():
        print("third")


if __name__ == '__main__':
    f = Foo()
    f.first(printFirst)
    f.second(printSecond)
    f.third(printThird)
