package Timus_2;

import java.util.Scanner;
public class example_1007 {
    public static void One(byte[] chars, int p, int w, char r) {
        for (int i = 0; i < p; i++) {
            if (i == w && r == '2')
                continue;
            if (i == w)
                System.out.append(r);
            System.out.append((char)chars[i]);
        }

        if (w == p)
            System.out.append(r);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int fullSum = 0;
        int Q[] = new int[N + 1];
        String word = null;
        byte[] chars = new byte[2001];
        int p = 0;
        while (true) {
            try {
                word = sc.nextLine();
            } catch (Exception e) {
                System.exit(0);
            }
            p = 0;
            if (word.isEmpty())
                continue;
            for (int i = 0;  i < word.length(); i++) {
                if (word.charAt(i) == '0')
                    chars[p++] = '0';
                else if (word.charAt(i) == '1')
                    chars[p++] = '1';
            }

            Q[p - 1]  = chars[p - 1] - '0';
            fullSum = p * Q[p - 1];
            for (int j = p - 2; j >= 0; j--) {
                Q[j] = Q[j + 1] + (chars[j] - '0');
                fullSum       += (j + 1)*(chars[j] - '0');
            }

            if (p == N) {
                if ((fullSum == 0) || (fullSum % (N + 1) == 0)) {
                    One(chars, p, -1, '0');
                }
                else {
                    for (int j = 0; j < p; j++) {
                        if ((fullSum - (j + 1) * (chars[j] - '0')) % (N + 1) == 0) {
                            chars[j] = '0';
                            One(chars, p, -1, '0');
                            break;
                        }
                    }
                }

            }

            else if (p == N - 1) {
                if ((fullSum == 0) || (fullSum % (N + 1) == 0)) {
                    One(chars, p, p, '0');
                }
                else {
                    for (int j = 0; j <= p; j++) {
                        if (j == p) {
                            if ((fullSum + (j + 1)) % (N + 1) == 0)
                                One(chars, p, p, '1');
                        }
                        else if ((fullSum + Q[j]) % (N + 1) == 0) {
                            One(chars, p, j, '0');
                            break;
                        }
                        else if ((fullSum + Q[j] + (j + 1)) % (N + 1) == 0) {
                            One(chars, p, j, '1');
                            break;
                        }
                    }
                }
            }
            else {
                for (int j = 0; j < p; j++) {
                    int y;
                    if (j == p - 1)
                        y = 0;
                    else
                        y = Q[j + 1];
                    if ((fullSum - y - (j + 1) * (chars[j] - '0')) % (N + 1) == 0) {
                        One(chars, p, j, '2');
                        break;
                    }
                }
            }
        }
    }
}
