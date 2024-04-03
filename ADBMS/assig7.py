import pymongo
myclient=pymongo.MongoClient("mongodb://localhost:27017/")
db=myclient["college"]
col=db["studlist"]


myquery =  { "gender": { "$eq": "female" },"course": { "$eq": "MCA" } }
mydoc = col.find(myquery,{"name":1,"mark":1, "_id":0})
print("Name and marks of female students in MCA \nName  \t\t  Marks ")
for x in mydoc:
    print(x["name"]["fname"]+" "+x["name"]["lname"]+"\t",x["mark"])
print("\n")

print("Details of student in MCA with heighest mark ")
myquery2={"course":{"$eq":"MCA"}}
mydoc2=col.find(myquery2,{}).sort("mark",-1)
print( "Name : "+ mydoc2[0]["name"]["fname"]+" "+mydoc2[0]["name"]["lname"])
print( "Address : "+ mydoc2[0]["address"]["house_name"]+" "+mydoc2[0]["address"]["city"])
print( "Course : "+ mydoc2[0]["course"])
print( "Mark : ",mydoc2[0]["mark"])
print( "Gender : "+ mydoc2[0]["gender"])
print( "Grade : "+ mydoc2[0]["grade"])
print( "Phone : "+ mydoc2[0]["phone"]["type"]+" ",mydoc2[0]["phone"]["no"])
print("\n")