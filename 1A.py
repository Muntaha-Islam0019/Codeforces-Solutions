user_input = str(input())
user_input = user_input.split()
n, m, a = [int(i) for i in user_input]

new_length = int(n / a)
new_width = int(m / a)

if n % a != 0:
    new_length += 1

if m % a != 0:
    new_width += 1

print(new_length * new_width)
