int main(int argc, char *argv[])
{
  int a, b, c;
  char output[100];
  scanf("%d", &a);
  scanf("%d", &b);
  scanf("%d", &c);
  output = solution(a, b, c);
  printf("%s", output);
  return 0;
}