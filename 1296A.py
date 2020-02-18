testCases = int(input())
while testCases > 0:

    elements = int(input())
    values_str = str(input())
    values = [int(x) for x in values_str.split()]

    even_count, odd_count, summation = 0, 0, 0
    for i in values:

        if (i % 2 != 0) or (i == 1):
            odd_count += 1
        else:
            even_count += 1

        summation += i

    if summation % 2 != 0 or summation == 1:
        print("YES")
    else:
        if odd_count != 0 and even_count != 0:
            print("YES")
        else:
            print("NO")

    testCases -= 1
