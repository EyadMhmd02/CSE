class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print("Hello my name is " + self.name + "and my age is " + str(self.age))

p1 = Person("Eyad", 23)
p1.introduce()

p2 = Person("Tayem", 14)
p2.introduce()

p3 = Person("Omar", 29)
p3.introduce()