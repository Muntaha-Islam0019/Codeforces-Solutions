t = int(input())
while t > 0:

    a_list = []
    user_input = str(input())
    user_input = user_input.split()
    for i in user_input:
        a_list.append(int(i))

    n = a_list.pop(3)

    a_list.sort()

    n = n - (a_list[0] - a_list[1])
    n = n - (a_list[0] - a_list[2])

    print(a_list)

    t -= 1
