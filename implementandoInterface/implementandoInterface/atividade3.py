import threading
import time
import random
from queue import Queue

buffer_size = 5
buffer = Queue(maxsize=buffer_size)

mutex = threading.Semaphore(1)
empty = threading.Semaphore(buffer_size)
full = threading.Semaphore(0)

def produtor():
    while True:
        item = random.randint(1, 100)
        empty.acquire()
        mutex.acquire()
        
        buffer.put(item)
        print(f'Produtor produziu: {item}')
        
        mutex.release()
        full.release()
        
        time.sleep(random.uniform(0.5, 2))

def consumidor():
    while True:
        full.acquire()
        mutex.acquire()
        
        item = buffer.get()
        print(f'Consumidor consumiu: {item}')
        
        mutex.release()
        empty.release()
        
        time.sleep(random.uniform(0.5, 2))

t1 = threading.Thread(target=produtor)
t2 = threading.Thread(target=consumidor)

t1.start()
t2.start()

t1.join()
t2.join()
