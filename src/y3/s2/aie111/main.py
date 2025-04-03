# list => []
# tuple => ()
# set => {}
# dictionary => {"":""}

with open("file.txt", "w") as file:
    file.write("Eyado, Mohamedo, Ghanemo")

with open("file.txt", "r") as file:
    content = file.read()
    print(content)